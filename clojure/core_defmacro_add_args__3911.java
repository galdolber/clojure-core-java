package clojure;

import clojure.lang.*;

public final class core_defmacro_add_args__3911 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 Object add_implicit_args8;
 public core_defmacro_add_args__3911(final Object add_implicit_args8) {
  super();
  this.add_implicit_args8 = add_implicit_args8;
 }
 public java.lang.Object invoke(java.lang.Object acc1, java.lang.Object ds2) {
  while(true) {
   if (clojure.lang.Util.identical(((java.lang.Object)ds2), ((java.lang.Object)null))) {
    return acc1;
   } else {
    {
     Object d3 = ((IFn)const__1.getRawRoot()).invoke(ds2);
     Object __r2290 = ((IFn)const__2.getRawRoot()).invoke(d3);
     if (__r2290 != null && !(__r2290 == Boolean.FALSE)) {
      return ((IFn)const__3.getRawRoot()).invoke(acc1, d3);
     } else {
      java.lang.Object acc1___aux = ((IFn)const__3.getRawRoot()).invoke(acc1, ((IFn)this.add_implicit_args8).invoke(d3));
      java.lang.Object ds2___aux = ((IFn)const__4.getRawRoot()).invoke(ds2);
      acc1 = acc1___aux;
      ds2 = ds2___aux;
      continue;
     }
    }
   }
  }
 }
}
