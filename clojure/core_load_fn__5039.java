package clojure;

import clojure.lang.*;

public final class core_load_fn__5039 extends clojure.lang.AFunction {
 public static final java.lang.Object const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (java.lang.Object)1L;
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 Object path12;
 public core_load_fn__5039(final Object path12) {
  super();
  this.path12 = path12;
 }
 public java.lang.Object invoke() {
  try {
   try {
    clojure.lang.RT.load((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.String)this.path12).substring((int)RT.intCast(1L)))));
    return null;
   } finally {
    ((IFn)const__1.getRawRoot()).invoke();
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
