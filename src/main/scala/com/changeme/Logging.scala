package com.changeme

import org.slf4j.LoggerFactory

trait Logging {
  val logger =  LoggerFactory.getLogger(getClass)
}