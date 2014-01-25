package clojure.java;

import clojure.lang.*;

public final class io_delete_file extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.java.io", "file");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public io_delete_file() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object p__87512) {
  {
   Object vec__87523 = p__87512;
   Object silently4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__87523), (int)RT.intCast(0L), ((java.lang.Object)null)));
   {
    boolean or__3968__auto__5 = ((java.io.File)((IFn)const__2.getRawRoot()).invoke(f1)).delete();
    if (or__3968__auto__5) {
     return (or__3968__auto__5 ? Boolean.TRUE : Boolean.FALSE);
    } else {
     {
      Object or__3968__auto__6 = silently4;
      Object __r6310 = or__3968__auto__6;
      if (__r6310 != null && !(__r6310 == Boolean.FALSE)) {
       return or__3968__auto__6;
      } else {
       Util.trow((Throwable)new java.io.IOException((java.lang.String)((java.lang.String)((IFn)const__3.getRawRoot()).invoke("Couldn't delete ", f1))));
       return null;
      }
     }
    }
   }
  }
 }
 public int getRequiredArity() {
  return 1;
 }
}
