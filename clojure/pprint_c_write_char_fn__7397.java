package clojure;

import clojure.lang.*;

public final class pprint_c_write_char_fn__7397 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Keyword const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__2 = (java.lang.Object)Character.valueOf((char)10);
  const__3 = (clojure.lang.Var)RT.var("clojure.pprint", "set-field");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "cur");
  const__5 = (java.lang.Object)0L;
  const__6 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__8 = (clojure.lang.Var)RT.var("clojure.pprint", "get-field");
 }
 Object c2;
 Object this1;
 public pprint_c_write_char_fn__7397(final Object c2, final Object this1) {
  super();
  this.c2 = c2;
  this.this1 = this1;
 }
 public java.lang.Object invoke() {
  if (clojure.lang.Util.equiv(((java.lang.Object)this.c2), (long)clojure.lang.RT.intCast(((java.lang.Object)const__2)))) {
   ((IFn)const__3.getRawRoot()).invoke(this.this1, const__4, const__5);
   return ((IFn)const__3.getRawRoot()).invoke(this.this1, const__6, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this.this1, const__6)))));
  } else {
   return ((IFn)const__3.getRawRoot()).invoke(this.this1, const__4, ((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)((IFn)const__8.getRawRoot()).invoke(this.this1, const__4)))));
  }
 }
}
