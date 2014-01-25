package clojure;

import clojure.lang.*;

public final class core_comp_fn__4183 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 Object fs5;
 public core_comp_fn__4183(final Object fs5) {
  super();
  this.fs5 = fs5;
 }
 public java.lang.Object doInvoke(java.lang.Object args1) {
  {
   Object ret2 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.fs5), args1);
   Object fs3 = ((IFn)const__2.getRawRoot()).invoke(this.fs5);
   while(true) {
    Object __r2459 = fs3;
    if (__r2459 != null && !(__r2459 == Boolean.FALSE)) {
     java.lang.Object ret2___aux = ((IFn)((IFn)const__1.getRawRoot()).invoke(fs3)).invoke(ret2);
     java.lang.Object fs3___aux = ((IFn)const__2.getRawRoot()).invoke(fs3);
     ret2 = ret2___aux;
     fs3 = fs3___aux;
     continue;
    } else {
     return ret2;
    }
   }
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
