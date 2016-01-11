package myob

//import myob.modules._
//import myob.model._
//import spatutorial.client.components.GlobalStyles
//import spatutorial.client.modules._
//import spatutorial.client.services.{RootModel, SPACircuit, ToLearns, Todos}

import japgolly.scalajs.react.{ReactDOM, ReactComponentB}
import org.scalajs.dom

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import japgolly.scalajs.react.vdom.prefix_<^._


@JSExport("BankingRulesMain")
object TutorialApp extends JSApp {
  def main(): Unit = {
//    appendPar(dom.document.body, "Hello World")
    val HelloMessage = ReactComponentB[String]("HelloMessage")
      .render($ => <.div("Hello ", $.props))
      .build

    ReactDOM.render(HelloMessage("John"), dom.document.body)
  }
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = dom.document.createElement("p")
    val textNode = dom.document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }
}
//object BankingRulesMain extends js.JSApp {
//
//  // Define the locations (pages) used in this application
//  sealed trait Loc
//
//  case object ListRulesLoc extends Loc
//  case class EditRuleLoc(ruleId:String) extends Loc
//
////  case object TodoLoc extends Loc
//
//  val itemPage = ReactComponentB[EditRuleLoc]("Edit Rule Item page")
//    .render(p => <.div(s"Info page for Rule #${p.props.ruleId}"))
//// OR ->    .render_P((p) => <.div(s"Info page for Rule #${p.ruleId}"))
//    .build
//
//
//
////  dynamicRouteCT("item" / int.caseClass[ItemPage])
////  ~> dynRender(itemPage(_))
//
//  // configure the router
//  val routerConfig = RouterConfigDsl[Loc].buildConfig { (dsl: RouterConfigDsl[Loc]) =>
//    import dsl._
//
//    // wrap/connect components to the circuit
////    (staticRoute(root, DashboardLoc) ~> renderR(ctl => SPACircuit.wrap(_.motd)((proxy: ModelProxy[Pot[String]]) => Dashboard(ctl, proxy)))
////      | staticRoute("#todo", TodoLoc) ~> renderR(ctl => SPACircuit.connect((model: RootModel) => model.todos)((proxy: ModelProxy[Pot[Todos]]) => Todo(proxy)))
////      | staticRoute("#tolearn", ToLearnLoc) ~> renderR(ctl => SPACircuit.connect((model: RootModel) => model.toLearns)((proxy: ModelProxy[Pot[ToLearns]]) => ToLearn(proxy)))
////      ).notFound(redirectToPage(DashboardLoc)(Redirect.Replace))
//
////    val r: Route[EditRuleLoc] = ("category" / string("[a-z]+") / uuid).caseClass[EditRuleLoc]
//
//    (staticRoute(root, ListRulesLoc) ~> renderR(ctl => BankingRulesCircuit.wrap((rootModel: model.RootModel) => rootModel.rules)((proxy: ModelProxy[Pot[model.Rules]]) => modules.Rule(ctl, proxy)))
//      | dynamicRouteCT("#item" / string("rule-.*").caseClassDebug[EditRuleLoc]) ~> dynRender(props => itemPage(props))
//
//      //      | dynamicRouteCT("item" / int.caseClass[EditRuleLoc]) ~> renderR(ctl => BankingRulesCircuit.connect((model: RootModel) => model.todos)((proxy: ModelProxy[Pot[Todos]]) => Todo(proxy)))
////      | staticRoute("#edit", EditRuleLoc) ~> renderR(ctl => BankingRulesCircuit.connect((model: RootModel) => model.todos)((proxy: ModelProxy[Pot[Todos]]) => Todo(proxy)))
//      ).notFound(redirectToPage(ListRulesLoc)(Redirect.Replace))
//  }.renderWith(layout)
//
//  // base layout for all pages
//  def layout(c: RouterCtl[Loc], r: Resolution[Loc]) = {
//    <.div(
//      // here we use plain Bootstrap class names as these are specific to the top level layout defined here
//      <.nav(^.className := "navbar navbar-inverse navbar-fixed-top",
//        <.div(^.className := "container",
//          <.div(^.className := "navbar-header", <.span(^.className := "navbar-brand", "Banking Rules...")),
//          <.div(^.className := "collapse navbar-collapse",
//            // connect menu to model, because it needs to update when the number of open todos changes
//            BankingRulesCircuit.connect { value =>
//              val rules = value.rules.map(_.items.count(!_.completed)).toOption
//              rules
//            }((modelProxy: ModelProxy[Option[Int]]) => modules.MainMenu(c, r.page, modelProxy))
//
//          )
//        )
//      ),
//      // currently active module is shown in this container
//      <.div(^.className := "container", r.render())
//    )
//  }
//
//  @JSExport
//  def main(): Unit = {
//    log.warn("Application starting")
//    // send log messages also to the server
//    log.enableServerLogging("/logging")
//    log.info("This message goes to server as well")
//
//    // create stylesheet
//    GlobalStyles.addToDocument()
//    // create the router
//    val router = Router(BaseUrl.until_#, routerConfig)
//    // tell React to render the router in the document body
//    ReactDOM.render(router(), dom.document.getElementById("root"))
//  }
//}
