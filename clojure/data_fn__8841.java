package clojure;

import clojure.lang.*;

public final class data_fn__8841 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.data", "diff-sequential");
  const__1 = (clojure.lang.Var)RT.var("clojure.data", "atom-diff");
 }
 public data_fn__8841() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  Object __r6393;
  Object __r6394 = Reflector.invokeNoArgInstanceMember(Reflector.invokeNoArgInstanceMember(a1, "getClass"), "isArray");
  if (__r6394 != null && !(__r6394 == Boolean.FALSE)) {
   __r6393 = const__0.getRawRoot();
  } else {
   __r6393 = const__1.getRawRoot();
  }
  return ((IFn)__r6393).invoke(a1, b2);
 }
}
