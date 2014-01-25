package clojure;

import clojure.lang.*;

public final class core_binding_var_ize__4122 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "concat");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "var");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "second");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_binding_var_ize__4122() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object var_vals1) {
  {
   Object ret2 = clojure.lang.PersistentVector.EMPTY;
   Object vvs3 = ((IFn)const__0.getRawRoot()).invoke(var_vals1);
   while(true) {
    Object __r2424 = vvs3;
    if (__r2424 != null && !(__r2424 == Boolean.FALSE)) {
     java.lang.Object ret2___aux = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(ret2, ((IFn)const__0.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__3.getRawRoot()).invoke(const__4), ((IFn)const__3.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(vvs3))))), ((IFn)const__6.getRawRoot()).invoke(vvs3));
     java.lang.Object vvs3___aux = ((IFn)const__7.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(vvs3));
     ret2 = ret2___aux;
     vvs3 = vvs3___aux;
     continue;
    } else {
     return ((IFn)const__0.getRawRoot()).invoke(ret2);
    }
   }
  }
 }
}
