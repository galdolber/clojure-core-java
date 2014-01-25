package clojure;

import clojure.lang.*;

public final class core_defmacro_fn__3905 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "list");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "string?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "map?");
 }
 Object args4;
 Object name3;
 public core_defmacro_fn__3905(final Object args4, final Object name3) {
  super();
  this.args4 = args4;
  this.name3 = name3;
 }
 public java.lang.Object invoke() {
  {
   Object p1 = ((IFn)const__0.getRawRoot()).invoke(this.name3);
   Object args2 = this.args4;
   while(true) {
    {
     Object f3 = ((IFn)const__1.getRawRoot()).invoke(args2);
     Object __r2281 = ((IFn)const__2.getRawRoot()).invoke(f3);
     if (__r2281 != null && !(__r2281 == Boolean.FALSE)) {
      java.lang.Object p1___aux = ((IFn)const__3.getRawRoot()).invoke(f3, p1);
      java.lang.Object args2___aux = ((IFn)const__4.getRawRoot()).invoke(args2);
      p1 = p1___aux;
      args2 = args2___aux;
      continue;
     } else {
      Object __r2283 = ((IFn)const__5.getRawRoot()).invoke(f3);
      if (__r2283 != null && !(__r2283 == Boolean.FALSE)) {
       java.lang.Object p1___aux = ((IFn)const__3.getRawRoot()).invoke(f3, p1);
       java.lang.Object args2___aux = ((IFn)const__4.getRawRoot()).invoke(args2);
       p1 = p1___aux;
       args2 = args2___aux;
       continue;
      } else {
       return p1;
      }
     }
    }
   }
  }
 }
}
