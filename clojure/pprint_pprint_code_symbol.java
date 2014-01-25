package clojure;

import clojure.lang.*;

public final class pprint_pprint_code_symbol extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "*symbol-map*");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-suppress-namespaces*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "pr");
 }
 public pprint_pprint_code_symbol() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object sym1) {
  {
   Object temp__4115__auto__2 = ((IFn)sym1).invoke(const__0.get());
   Object __r6207 = temp__4115__auto__2;
   if (__r6207 != null && !(__r6207 == Boolean.FALSE)) {
    {
     Object arg_num3 = temp__4115__auto__2;
     return ((IFn)const__1.getRawRoot()).invoke(arg_num3);
    }
   } else {
    Object __r6209 = const__2.get();
    if (__r6209 != null && !(__r6209 == Boolean.FALSE)) {
     return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(sym1));
    } else {
     return ((IFn)const__4.get()).invoke(sym1);
    }
   }
  }
 }
}
