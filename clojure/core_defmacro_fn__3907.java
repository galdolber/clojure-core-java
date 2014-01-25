package clojure;

import clojure.lang.*;

public final class core_defmacro_fn__3907 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map?");
 }
 Object args4;
 public core_defmacro_fn__3907(final Object args4) {
  super();
  this.args4 = args4;
 }
 public java.lang.Object invoke() {
  {
   Object fd1 = this.args4;
   while(true) {
    Object __r2285 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(fd1));
    if (__r2285 != null && !(__r2285 == Boolean.FALSE)) {
     java.lang.Object fd1___aux = ((IFn)const__2.getRawRoot()).invoke(fd1);
     fd1 = fd1___aux;
     continue;
    } else {
     Object __r2287 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(fd1));
     if (__r2287 != null && !(__r2287 == Boolean.FALSE)) {
      java.lang.Object fd1___aux = ((IFn)const__2.getRawRoot()).invoke(fd1);
      fd1 = fd1___aux;
      continue;
     } else {
      return fd1;
     }
    }
   }
  }
 }
}
