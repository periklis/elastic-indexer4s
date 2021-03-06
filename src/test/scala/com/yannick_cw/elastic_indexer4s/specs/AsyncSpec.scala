package com.yannick_cw.elastic_indexer4s.specs

import org.scalatest.concurrent.ScalaFutures
import org.scalatest._

abstract class AsyncSpec
    extends AsyncWordSpecLike
    with Matchers
    with ScalaFutures
    with Inspectors
    with EitherValues
    with BeforeAndAfterAll
