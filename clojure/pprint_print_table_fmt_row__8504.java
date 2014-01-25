package clojure;

import clojure.lang.*;

public final class pprint_print_table_fmt_row__8504 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "vector");
 }
 Object ks1;
 Object fmts5;
 public pprint_print_table_fmt_row__8504(final Object ks1, final Object fmts5) {
  super();
  this.ks1 = ks1;
  this.fmts5 = fmts5;
 }
 public java.lang.Object invoke(java.lang.Object leader1, java.lang.Object divider2, java.lang.Object trailer3, java.lang.Object row4) {
  Object __r6220 = null;
  {
   Object iter__4618__auto__5 = new clojure.pprint_print_table_fmt_row__8504_iter__8505__8509();
   __r6220 = ((IFn)iter__4618__auto__5).invoke(((IFn)const__3.getRawRoot()).invoke(const__4.getRawRoot(), ((IFn)const__3.getRawRoot()).invoke(new clojure.pprint_print_table_fmt_row__8504_fn__8520(row4), this.ks1), this.fmts5));
  }
  return ((IFn)const__0.getRawRoot()).invoke(leader1, ((IFn)const__1.getRawRoot()).invoke(const__0.getRawRoot(), ((IFn)const__2.getRawRoot()).invoke(divider2, __r6220)), trailer3);
 }
}
