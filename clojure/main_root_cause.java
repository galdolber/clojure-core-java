package clojure;

import clojure.lang.*;

public final class main_root_cause extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "instance?");
  const__1 = (java.lang.Object)clojure.lang.Compiler.CompilerException.class;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "not=");
 }
 public main_root_cause() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object t1) {
  {
   Object cause2 = t1;
   while(true) {
    Object __r4424 = null;
    {
     boolean and__3966__auto__3 = (cause2 instanceof clojure.lang.Compiler.CompilerException);
     Object __r4425;
     if (and__3966__auto__3) {
      __r4425 = ((IFn)const__2.getRawRoot()).invoke(((java.lang.String)((clojure.lang.Compiler.CompilerException)cause2).source), "NO_SOURCE_FILE");
     } else {
      __r4425 = (and__3966__auto__3 ? Boolean.TRUE : Boolean.FALSE);
     }
     __r4424 = __r4425;
    }
    Object __r4426 = __r4424;
    if (__r4426 != null && !(__r4426 == Boolean.FALSE)) {
     return cause2;
    } else {
     {
      Object temp__4115__auto__4 = ((java.lang.Throwable)((java.lang.Throwable)cause2).getCause());
      Object __r4428 = temp__4115__auto__4;
      if (__r4428 != null && !(__r4428 == Boolean.FALSE)) {
       {
        Object cause5 = temp__4115__auto__4;
        java.lang.Object cause2___aux = cause5;
        cause2 = cause2___aux;
        continue;
       }
      } else {
       return cause2;
      }
     }
    }
   }
  }
 }
}
