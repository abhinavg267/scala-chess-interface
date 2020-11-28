package chessapi.uci.driver

import chessapi.uci.driver.UCIProcedure.{SendUCICommand, switchToUCI}

object UCIChessApp extends App {
  val engine = UCIEngine(s"/usr/local/bin/stockfish")
//  val v = (UCIProcedure.switchToUCI ->
//    UCIProcedure.isReady ->
//    UCIProcedure.startANewGame).execute(engine)


  val t: Unit = SendUCICommand(UCICommand.UCI).execute(engine)

//  engine.sendUCICommand("uci")
//  engine.readResponse("uciok", trace = true)
//  engine.sendUCICommand("isready")
//  println(engine.readResponse("readyok"))
//  engine.sendUCICommand("position startpos moves e2e4")
//  engine.sendUCICommand("isready")
//  println(engine.readResponse("readyok"))
//  engine.sendUCICommand("go depth 22")
//  println(engine.readResponse("bestmove"))
  engine.destroy()
}
