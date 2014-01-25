package clojure;

import clojure.lang.*;

public final class main_repl_caught extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final java.lang.Object const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.main", "repl-exception");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "zero?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "aget");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__5 = (java.lang.Object)0L;
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "*err*");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "class");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__14 = (java.lang.Object)clojure.lang.Compiler.CompilerException.class;
  const__15 = (clojure.lang.Var)RT.var("clojure.main", "stack-element-str");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public main_repl_caught() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object e1) {
  {
   Object ex2 = ((IFn)const__0.getRawRoot()).invoke(e1);
   Object tr3 = Reflector.invokeNoArgInstanceMember(ex2, "getStackTrace");
   Object __r4450;
   if (clojure.lang.Numbers.isZero((long)clojure.lang.RT.count(((java.lang.Object)tr3)))) {
    __r4450 = null;
   } else {
    __r4450 = Reflector.invokeStaticMethod(clojure.lang.RT.class, "aget", new Object[]{tr3, Integer.valueOf(clojure.lang.RT.intCast((long)0L))});
   }
   Object el4 = __r4450;
   {
    ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(const__8, const__9.get()));
    try {
     Object __r4451;
     if ((ex2 instanceof clojure.lang.Compiler.CompilerException)) {
      __r4451 = null;
     } else {
      Object __r4452;
      Object __r4453 = el4;
      if (__r4453 != null && !(__r4453 == Boolean.FALSE)) {
       __r4452 = ((IFn)const__15.getRawRoot()).invoke(el4);
      } else {
       __r4452 = "[trace missing]";
      }
      __r4451 = ((IFn)const__11.getRawRoot()).invoke(" ", __r4452);
     }
     return ((IFn)const__10.getRawRoot()).invoke(((IFn)const__11.getRawRoot()).invoke(((java.lang.String)((java.lang.Class)((IFn)const__12.getRawRoot()).invoke(ex2)).getSimpleName()), " ", Reflector.invokeNoArgInstanceMember(ex2, "getMessage"), " ", __r4451));
    } finally {
     ((IFn)const__16.getRawRoot()).invoke();
    }
   }
  }
 }
}
