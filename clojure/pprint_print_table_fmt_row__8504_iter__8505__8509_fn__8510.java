package clojure;

import clojure.lang.*;

public final class pprint_print_table_fmt_row__8504_iter__8505__8509_fn__8510 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final java.lang.Object const__11;
 public static final java.lang.Object const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-buffer");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "chunk-cons");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "chunk");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "nth");
  const__11 = (java.lang.Object)0L;
  const__12 = (java.lang.Object)1L;
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "format");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object s__85061;
 Object iter__85050;
 public pprint_print_table_fmt_row__8504_iter__8505__8509_fn__8510(final Object s__85061, final Object iter__85050) {
  super();
  this.s__85061 = s__85061;
  this.iter__85050 = iter__85050;
 }
 public java.lang.Object invoke() {
  {
   Object s__85061 = this.s__85061;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__85061);
     Object __r6215 = temp__4117__auto__2;
     if (__r6215 != null && !(__r6215 == Boolean.FALSE)) {
      {
       Object s__85063 = temp__4117__auto__2;
       Object __r6217 = ((IFn)const__1.getRawRoot()).invoke(s__85063);
       if (__r6217 != null && !(__r6217 == Boolean.FALSE)) {
        {
         Object c__4616__auto__4 = ((IFn)const__2.getRawRoot()).invoke(s__85063);
         int size__4617__auto__5 = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4616__auto__4)));
         Object b__85086 = ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(size__4617__auto__5));
         Object __r6219 = ((IFn)new clojure.pprint_print_table_fmt_row__8504_iter__8505__8509_fn__8510_fn__8511(c__4616__auto__4, b__85086, size__4617__auto__5)).invoke();
         if (__r6219 != null && !(__r6219 == Boolean.FALSE)) {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__85086), ((IFn)this.iter__85050).invoke(((IFn)const__8.getRawRoot()).invoke(s__85063)));
         } else {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__85086), null);
         }
        }
       } else {
        {
         Object vec__85147 = ((IFn)const__9.getRawRoot()).invoke(s__85063);
         Object col8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__85147), (int)RT.intCast(0L), ((java.lang.Object)null)));
         Object fmt9 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__85147), (int)RT.intCast(1L), ((java.lang.Object)null)));
         return ((IFn)const__13.getRawRoot()).invoke(((IFn)const__14.getRawRoot()).invoke(fmt9, ((IFn)const__15.getRawRoot()).invoke(col8)), ((IFn)this.iter__85050).invoke(((IFn)const__16.getRawRoot()).invoke(s__85063)));
        }
       }
      }
     } else {
      return null;
     }
    }
   }
  }
 }
}
