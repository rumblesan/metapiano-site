package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def about = Action {
    Ok(views.html.about())
  }

  def write = Action {
    Ok(views.html.write())
  }

  def submit = Action {
    Ok(views.html.submit())
  }

  def poems = Action {
    Ok(views.html.poems())
  }

  def stream = Action {
    Ok(views.html.stream())
  }

}
