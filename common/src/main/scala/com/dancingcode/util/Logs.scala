package com.dancingcode.util

import org.slf4j._;
/**
 * Logging trait to mix into framework - free classes
 *
 * @see <a href="http://stackoverflow.com/questions/2018528/logging-in-scala">other examples</a>
 * @author <a href="mailto:slavaschmidt@gmx.de">Slava Schmidt</a>
 */

trait Logs {
  private[this] val logger = LoggerFactory.getLogger(getClass().getName());

  def debug(message: => String) = if (logger.isDebugEnabled) logger.debug(message)
  def debug(message: => String, ex:Throwable) = if (logger.isDebugEnabled) logger.debug(message,ex)
  def debugValue[T](valueName: String, value: => T):T = {
    val result:T = value
    debug(valueName + " == " + result.toString)
    result
  }

  def info(message: => String) = if (logger.isInfoEnabled) logger.info(message)
  def info(message: => String, ex:Throwable) = if (logger.isInfoEnabled) logger.info(message,ex)

  def warn(message: => String) = if (logger.isWarnEnabled) logger.warn(message)
  def warn(message: => String, ex:Throwable) = if (logger.isWarnEnabled) logger.warn(message,ex)

  def error(ex:Throwable) = if (logger.isErrorEnabled) logger.error(ex.toString,ex)
  def error(message: => String) = if (logger.isErrorEnabled) logger.error(message)
  def error(message: => String, ex:Throwable) = if (logger.isErrorEnabled) logger.error(message,ex)

}