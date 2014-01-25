package clojure;

import clojure.lang.*;

public final class pprint_upcase_writer extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "init-proxy");
 }
 public pprint_upcase_writer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object writer1) {
  {
   Object p__5329__auto__2 = new clojure.pprint.proxy$java.io.Writer$0();
   ((IFn)const__0.getRawRoot()).invoke(p__5329__auto__2, RT.mapUniqueKeys("write", new clojure.pprint_upcase_writer_fn__7868(writer1), "flush", new clojure.pprint_upcase_writer_fn__7873(writer1), "close", new clojure.pprint_upcase_writer_fn__7875(writer1)));
   return p__5329__auto__2;
  }
 }
}
