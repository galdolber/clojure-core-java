package clojure;

import clojure.lang.*;

public final class core_line_seq extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "cons");
 }
 public core_line_seq() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object rdr1) {
  try {
   {
    Object temp__4117__auto__2 = ((java.lang.String)((java.io.BufferedReader)rdr1).readLine());
    Object __r2551 = temp__4117__auto__2;
    if (__r2551 != null && !(__r2551 == Boolean.FALSE)) {
     {
      Object line3 = temp__4117__auto__2;
      return ((IFn)const__0.getRawRoot()).invoke(line3, new clojure.lang.LazySeq((clojure.lang.IFn)((clojure.lang.IFn)new clojure.core_line_seq_fn__4317(rdr1))));
     }
    } else {
     return null;
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
