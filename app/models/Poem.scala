package models

import scala.language.implicitConversions

import DeployTrackDb._

import org.squeryl.KeyedEntity
import org.squeryl.PrimitiveTypeMode._

import play.api.libs.json._
import play.api.libs.functional.syntax._

object Poem {

  def create(poem: Poem): Poem = inTransaction {
    poems.insert(poem)
  }

  def retrieveOne(id: Long): Option[Poem] = inTransaction {
    from(poems)(p =>
      where(p.id === id)
      select(p)
    ).headOption
  }

  def retrieveAll(): List[Poem] = inTransaction {
    from(poems)(select(_)).toList
  }

  def updateFull(poem: Poem): Int = inTransaction {
    update(poems)(p =>
      where(p.id === poem.id)
      set(p.text := poem.text)
    )
  }

  def delete(id: Long): Int = inTransaction {
    poems.deleteWhere(p => p.id === id)
  }

  implicit val poemWrites: Writes[Poem] = Json.writes[Poem]

}

case class Poem(id: Long,
                text: String) extends KeyedEntity[Long]


