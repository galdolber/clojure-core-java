package clojure;

import clojure.lang.*;

public final class core_memoize_fn__5070 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "find");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "val");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "swap!");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 Object f1;
 Object mem2;
 public core_memoize_fn__5070(final Object f1, final Object mem2) {
  super();
  this.f1 = f1;
  this.mem2 = mem2;
 }
 public java.lang.Object doInvoke(java.lang.Object args1) {
  {
   Object temp__4115__auto__2 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(this.mem2), args1);
   Object __r3247 = temp__4115__auto__2;
   if (__r3247 != null && !(__r3247 == Boolean.FALSE)) {
    {
     Object e3 = temp__4115__auto__2;
     return ((IFn)const__2.getRawRoot()).invoke(e3);
    }
   } else {
    {
     Object ret4 = ((IFn)const__3.getRawRoot()).invoke(this.f1, args1);
     ((IFn)const__4.getRawRoot()).invoke(this.mem2, const__5.getRawRoot(), args1, ret4);
     return ret4;
    }
   }
  }
 }
 public int getRequiredArity() {
  return 0;
 }
}
