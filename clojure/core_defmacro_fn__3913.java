package clojure;

import clojure.lang.*;

public final class core_defmacro_fn__3913 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "first");
 }
 Object fdecl10;
 Object prefix5;
 public core_defmacro_fn__3913(final Object fdecl10, final Object prefix5) {
  super();
  this.fdecl10 = fdecl10;
  this.prefix5 = prefix5;
 }
 public java.lang.Object invoke() {
  {
   Object p1 = this.prefix5;
   Object d2 = this.fdecl10;
   while(true) {
    Object __r2292 = p1;
    if (__r2292 != null && !(__r2292 == Boolean.FALSE)) {
     java.lang.Object p1___aux = ((IFn)const__0.getRawRoot()).invoke(p1);
     java.lang.Object d2___aux = ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(p1), d2);
     p1 = p1___aux;
     d2 = d2___aux;
     continue;
    } else {
     return d2;
    }
   }
  }
 }
}
