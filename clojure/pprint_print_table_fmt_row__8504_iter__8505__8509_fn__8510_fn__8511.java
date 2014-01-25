package clojure;

import clojure.lang.*;

public final class pprint_print_table_fmt_row__8504_iter__8505__8509_fn__8510_fn__8511 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__4 = (java.lang.Object)1L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-append");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "format");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
 }
 Object c__4616__auto__4;
 Object b__85086;
 int size__4617__auto__5;
 public pprint_print_table_fmt_row__8504_iter__8505__8509_fn__8510_fn__8511(final Object c__4616__auto__4, final Object b__85086, final int size__4617__auto__5) {
  super();
  this.c__4616__auto__4 = c__4616__auto__4;
  this.b__85086 = b__85086;
  this.size__4617__auto__5 = size__4617__auto__5;
 }
 public java.lang.Object invoke() {
  {
   long i__85071 = clojure.lang.RT.longCast((int)clojure.lang.RT.intCast((long)0L));
   while(true) {
    if (clojure.lang.Numbers.lt((long)i__85071, (long)size__4617__auto__5)) {
     {
      Object vec__85122 = ((java.lang.Object)((clojure.lang.Indexed)this.c__4616__auto__4).nth((int)RT.intCast(i__85071)));
      Object col3 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__85122), (int)RT.intCast(0L), ((java.lang.Object)null)));
      Object fmt4 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__85122), (int)RT.intCast(1L), ((java.lang.Object)null)));
      ((IFn)const__5.getRawRoot()).invoke(this.b__85086, ((IFn)const__6.getRawRoot()).invoke(fmt4, ((IFn)const__7.getRawRoot()).invoke(col3)));
      long i__85071___aux = clojure.lang.Numbers.unchecked_inc((long)i__85071);
      i__85071 = i__85071___aux;
      continue;
     }
    } else {
     return Boolean.TRUE;
    }
   }
  }
 }
}
