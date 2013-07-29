package controllers

import play.api._
import play.api.mvc._

import models.Poem

import play.api.libs.json._

object Poems extends Controller {

  def latest(lastId: Long = 0) = Action {

    Ok(
      Json.toJson(
        Poem.retrieveLatest(lastId)
      )
    )

  }

}
