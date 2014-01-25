package clojure;

import clojure.lang.*;

public final class core_fn__5403 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_fn__5403() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object o1, java.lang.Object w2) {
  try {
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("#=(var ", ((clojure.lang.Symbol)((clojure.lang.Namespace)((clojure.lang.Namespace)((clojure.lang.Var)o1).ns)).name), "/", ((clojure.lang.Symbol)((clojure.lang.Var)o1).sym), ")")));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
