package com.dancingcode

import akka.actor.Actor
import org.osgi.framework.BundleActivator
import org.osgi.framework.BundleContext

import com.dancingcode.util.Logs

class OsgiTest extends BundleActivator with Logs {

  override def start(context: BundleContext) {
    try {
      info("Starting")
      info(classOf[Actor].toString)
    } catch {
      case ex => ex.printStackTrace
    }
  }

  override def stop(context: BundleContext) {
    info("Stopped")
  }

}
