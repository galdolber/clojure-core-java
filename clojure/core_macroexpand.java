package clojure;

import clojure.lang.*;

public final class core_macroexpand extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "macroexpand-1");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "identical?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "macroexpand");
 }
 public core_macroexpand() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object form1) {
  {
   Object ex2 = ((IFn)const__0.getRawRoot()).invoke(form1);
   if (clojure.lang.Util.identical(((java.lang.Object)ex2), ((java.lang.Object)form1))) {
    return form1;
   } else {
    return ((IFn)const__2.getRawRoot()).invoke(ex2);
   }
  }
 }
}
