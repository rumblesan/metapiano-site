package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("metapiano-site is ready to roll!!"))
  }
  
}
