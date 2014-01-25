package clojure;

import clojure.lang.*;

public final class core_emit_protocol_fn__5976 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Keyword const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "munge");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "name");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__3 = (clojure.lang.Keyword)Keyword.intern(null, "arglists");
 }
 public core_emit_protocol_fn__5976() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object sig1) {
  {
   Object m2 = ((IFn)const__0.getRawRoot()).invoke(RT.get(sig1, Keyword.intern(null, "name")));
   return ((IFn)const__2.getRawRoot()).invoke(new clojure.core_emit_protocol_fn__5976_fn__5977(m2), RT.get(sig1, Keyword.intern(null, "arglists")));
  }
 }
}
