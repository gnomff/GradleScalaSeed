

package com.changeme

object Main extends Logging{
  def main( args:Array[String] ):Unit = args.foreach(logger.info(_))
}