/**
 * Copyright (c) 2010 WeigleWilczek.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.weiglewilczek.gameoflife

case class Cell(x: Int, y: Int) {

  override def toString = position

  private lazy val position = "(%s, %s)".format(x, y)
}
