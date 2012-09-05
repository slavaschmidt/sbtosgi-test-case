package com.dancingcode.util

/**
 * @author <a href="mailto:slavaschmidt@gmx.de">Slava Schmidt</a>
 * @since 13.08.2012
 */
trait Resources {

	  def fromFile(name: String) = scala.io.Source.fromInputStream(
      this.getClass.getClassLoader.getResourceAsStream(name)
    ).getLines.mkString

}