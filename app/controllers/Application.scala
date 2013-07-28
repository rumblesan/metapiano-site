package controllers

import play.api._
import play.api.mvc._

import models.Poem

import play.api.data._
import play.api.data.Forms._


object Application extends Controller {

  val poemForm = Form(
    "text" -> text
  )

  def about = Action {
    Ok(views.html.about())
  }

  def write = Action {
    Ok(views.html.write())
  }

  def submit = Action { implicit request =>
    poemForm.bindFromRequest.fold(
      formWithErrors =>
        Ok(formWithErrors.toString),
      value => {

        Poem.create(
          Poem(
            0,
            value
          )
        )

        Ok(views.html.submit())
      })
  }

  def poems = Action {
    Ok(
      views.html.poems(
        Poem.retrieveAll()
      )
    )
  }

  def stream = Action {
    Ok(views.html.stream())
  }

}
