package clojure;

import clojure.lang.*;

public final class pprint_write_buffered_output extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.pprint", "write-line");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "buffer");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "write-tokens");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "alter");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "assoc");
 }
 public pprint_write_buffered_output() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  ((IFn)const__0.getRawRoot()).invoke(this1);
  {
   Object temp__4115__auto__2 = RT.get(((IFn)const__2.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this1)), Keyword.intern(null, "buffer"));
   Object __r4948 = temp__4115__auto__2;
   if (__r4948 != null && !(__r4948 == Boolean.FALSE)) {
    {
     Object buf3 = temp__4115__auto__2;
     ((IFn)const__3.getRawRoot()).invoke(this1, buf3, Boolean.TRUE);
     return ((IFn)const__4.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this1), const__5.getRawRoot(), const__1, clojure.lang.PersistentVector.EMPTY);
    }
   } else {
    return null;
   }
  }
 }
}
