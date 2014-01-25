package clojure;

import clojure.lang.*;

public final class pprint_format_error extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (java.lang.Object)Character.valueOf((char)10);
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "*format-str*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__5 = (java.lang.Object)Character.valueOf((char)32);
 }
 public pprint_format_error() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object message1, java.lang.Object offset2) {
  {
   Object full_message3 = ((IFn)const__0.getRawRoot()).invoke(message1, const__1, const__2.get(), const__1, ((IFn)const__3.getRawRoot()).invoke(const__0.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(offset2, const__5)), "^", const__1);
   Util.trow((Throwable)new java.lang.RuntimeException((java.lang.String)((java.lang.String)full_message3)));
   return null;
  }
 }
}
