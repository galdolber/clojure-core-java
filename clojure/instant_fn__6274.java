package clojure;

import clojure.lang.*;

public final class instant_fn__6274 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "init-proxy");
 }
 public instant_fn__6274() {
  super();
 }
 public java.lang.Object invoke() {
  {
   Object p__5329__auto__1 = new clojure.instant.proxy$java.lang.ThreadLocal$0();
   ((IFn)const__0.getRawRoot()).invoke(p__5329__auto__1, RT.mapUniqueKeys("initialValue", new clojure.instant_fn__6274_fn__6275()));
   return p__5329__auto__1;
  }
 }
}
