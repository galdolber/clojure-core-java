package clojure;

import clojure.lang.*;

public final class pprint_column_writer_fn__7401_fn__7405 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Keyword const__8;
 public static final clojure.lang.Var const__9;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "neg?");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "set-field");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "cur");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__4 = (clojure.lang.Var)RT.var("clojure.pprint", "get-field");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "-");
  const__7 = (java.lang.Object)1L;
  const__8 = (clojure.lang.Keyword)Keyword.intern(null, "line");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "filter");
 }
 int nl6;
 Object this1;
 Object s5;
 public pprint_column_writer_fn__7401_fn__7405(final int nl6, final Object this1, final Object s5) {
  super();
  this.nl6 = nl6;
  this.this1 = this1;
  this.s5 = s5;
 }
 public java.lang.Object invoke() {
  if (clojure.lang.Numbers.isNeg((long)nl6)) {
   return ((IFn)const__1.getRawRoot()).invoke(this.this1, const__2, ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)((IFn)const__4.getRawRoot()).invoke(this.this1, const__2)), (long)clojure.lang.RT.count(((java.lang.Object)this.s5)))));
  } else {
   ((IFn)const__1.getRawRoot()).invoke(this.this1, const__2, Numbers.num(clojure.lang.Numbers.minus((long)clojure.lang.Numbers.minus((long)clojure.lang.RT.count(((java.lang.Object)this.s5)), (long)nl6), (long)1L)));
   return ((IFn)const__1.getRawRoot()).invoke(this.this1, const__8, ((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)((IFn)const__4.getRawRoot()).invoke(this.this1, const__8)), (long)clojure.lang.RT.count(((java.lang.Object)((IFn)const__9.getRawRoot()).invoke(new clojure.pprint_column_writer_fn__7401_fn__7405_fn__7406(), this.s5))))));
  }
 }
}
