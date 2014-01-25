package clojure;

import clojure.lang.*;

public final class pprint_init_cap_writer extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ref");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "init-proxy");
 }
 public pprint_init_cap_writer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object writer1) {
  {
   Object capped2 = ((IFn)const__0.getRawRoot()).invoke(Boolean.FALSE);
   {
    Object p__5329__auto__3 = new clojure.pprint.proxy$java.io.Writer$0();
    ((IFn)const__1.getRawRoot()).invoke(p__5329__auto__3, RT.mapUniqueKeys("write", new clojure.pprint_init_cap_writer_fn__7900(capped2, writer1), "flush", new clojure.pprint_init_cap_writer_fn__7911(writer1), "close", new clojure.pprint_init_cap_writer_fn__7913(writer1)));
    return p__5329__auto__3;
   }
  }
 }
}
