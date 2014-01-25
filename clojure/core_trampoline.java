package clojure;

import clojure.lang.*;

public final class core_trampoline extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "fn?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "trampoline");
 }
 public core_trampoline() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object args2) {
  return ((IFn)const__1.getRawRoot()).invoke(new clojure.core_trampoline_fn__5065(f1, args2));
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  while(true) {
   {
    Object ret2 = ((IFn)f1).invoke();
    Object __r3241 = ((IFn)const__0.getRawRoot()).invoke(ret2);
    if (__r3241 != null && !(__r3241 == Boolean.FALSE)) {
     java.lang.Object f1___aux = ret2;
     f1 = f1___aux;
     continue;
    } else {
     return ret2;
    }
   }
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
