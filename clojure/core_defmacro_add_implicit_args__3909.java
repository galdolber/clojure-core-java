package clojure;

import clojure.lang.*;

public final class core_defmacro_add_implicit_args__3909 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 public static final clojure.lang.Symbol const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "vec");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, "&form");
  const__4 = (clojure.lang.Symbol)Symbol.intern(null, "&env");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_defmacro_add_implicit_args__3909() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object fd1) {
  {
   Object args2 = ((IFn)const__0.getRawRoot()).invoke(fd1);
   return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(const__3, ((IFn)const__1.getRawRoot()).invoke(const__4, args2))), ((IFn)const__5.getRawRoot()).invoke(fd1));
  }
 }
}
