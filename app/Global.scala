import org.squeryl.adapters.{H2Adapter, PostgreSqlAdapter}
import org.squeryl.internals.DatabaseAdapter
import org.squeryl.{Session, SessionFactory}
import play.api.db.DB
import play.api.GlobalSettings

import play.api.Application

object Global extends GlobalSettings {

  /** This implements basic DB session management
   *
   *  If the application mode is test then it will use the H2 in memory DB
   *  Otherwise it will use the specified database for that mode
   */

  override def onStart(app: Application) {
    SessionFactory.concreteFactory = {

      app.configuration.getString("application.mode") match {
        case Some("test") => {
          case Some("org.h2.Driver") => Some(() => getSession(new H2Adapter, app))
        }
        case Some(mode) => {
          "db.%s.driver".format(mode) match {
            // Uncomment these as needed
            // case Some("org.h2.Driver") => Some(() => getSession(new H2Adapter, app))
            // case Some("org.postgresql.Driver") => Some(() => getSession(new PostgreSqlAdapter, app))
            case _ => sys.error("Database driver must be either org.h2.Driver or org.postgresql.Driver")
          }

        }
        case None => sys.error("Need to specify application mode")
      }

    }
  }

  def getSession(adapter:DatabaseAdapter, app: Application) = Session.create(DB.getConnection()(app), adapter)

}

