package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def about = Action {
    Ok("Submitted")
  }

  def write = Action {
    Ok(views.html.index())
  }

  def submit = Action {
    Ok("Submitted")
  }

  def poems = Action {
    Ok("Poems")
  }

  def stream = Action {
    Ok("Stream")
  }

}
