package clojure;

import clojure.lang.*;

public final class uuid_fn__6294 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public uuid_fn__6294() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object uuid1, java.lang.Object w2) {
  try {
   ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke("#uuid \"", ((IFn)const__0.getRawRoot()).invoke(uuid1), "\"")));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
