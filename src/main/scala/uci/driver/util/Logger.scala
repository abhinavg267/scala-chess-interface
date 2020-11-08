package uci.driver.util

/** Logs to console
 * */
object Logger {
  def info(message: String): Unit = println(s"[INFO][UCIChess] $message")
  def error(message: String): Unit = println(s"[ERROR][UCIChess] $message")
}
