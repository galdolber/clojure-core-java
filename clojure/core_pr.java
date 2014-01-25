package clojure;

import clojure.lang.*;

public final class core_pr extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "pr-on");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "*out*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "pr");
  const__3 = (java.lang.Object)Character.valueOf((char)32);
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 public core_pr() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object x1, java.lang.Object more2) {
  try {
   while(true) {
    ((IFn)const__2.get()).invoke(x1);
    ((java.io.Writer)const__1.get()).append((char)((Character)const__3).charValue());
    {
     Object temp__4115__auto__3 = ((IFn)const__4.getRawRoot()).invoke(more2);
     Object __r2701 = temp__4115__auto__3;
     if (__r2701 != null && !(__r2701 == Boolean.FALSE)) {
      {
       Object nmore4 = temp__4115__auto__3;
       java.lang.Object x1___aux = ((IFn)const__5.getRawRoot()).invoke(more2);
       java.lang.Object more2___aux = nmore4;
       x1 = x1___aux;
       more2 = more2___aux;
       continue;
      }
     } else {
      return ((IFn)const__6.getRawRoot()).invoke(const__2.get(), more2);
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
 public java.lang.Object invoke(java.lang.Object x1) {
  return ((IFn)const__0.getRawRoot()).invoke(x1, const__1.get());
 }
 public java.lang.Object invoke() {
  return null;
 }
 public int getRequiredArity() {
  return 1;
 }
}
