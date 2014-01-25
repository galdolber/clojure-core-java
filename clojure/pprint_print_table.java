package clojure;

import clojure.lang.*;

public final class pprint_print_table extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "println");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "zipmap");
  const__4 = (java.lang.Object)0L;
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__14 = (clojure.lang.Var)RT.var("clojure.pprint", "print-table");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "keys");
 }
 public pprint_print_table() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object ks1, java.lang.Object rows2) {
  Object __r6222 = ((IFn)const__0.getRawRoot()).invoke(rows2);
  if (__r6222 != null && !(__r6222 == Boolean.FALSE)) {
   {
    Object widths3 = ((IFn)const__1.getRawRoot()).invoke(new clojure.pprint_print_table_fn__8496(rows2), ks1);
    Object spacers4 = ((IFn)const__1.getRawRoot()).invoke(new clojure.pprint_print_table_fn__8500(), widths3);
    Object fmts5 = ((IFn)const__1.getRawRoot()).invoke(new clojure.pprint_print_table_fn__8502(), widths3);
    Object fmt_row6 = new clojure.pprint_print_table_fmt_row__8504(ks1, fmts5);
    ((IFn)const__2.getRawRoot()).invoke();
    ((IFn)const__2.getRawRoot()).invoke(((IFn)fmt_row6).invoke("| ", " | ", " |", ((IFn)const__3.getRawRoot()).invoke(ks1, ks1)));
    ((IFn)const__2.getRawRoot()).invoke(((IFn)fmt_row6).invoke("|-", "-+-", "-|", ((IFn)const__3.getRawRoot()).invoke(ks1, spacers4)));
    {
     Object seq_85247 = ((IFn)const__0.getRawRoot()).invoke(rows2);
     Object chunk_85258 = null;
     long count_85269 = 0L;
     long i_852710 = 0L;
     while(true) {
      if (clojure.lang.Numbers.lt((long)i_852710, (long)count_85269)) {
       {
        Object row11 = ((java.lang.Object)((clojure.lang.Indexed)chunk_85258).nth((int)RT.intCast(i_852710)));
        ((IFn)const__2.getRawRoot()).invoke(((IFn)fmt_row6).invoke("| ", " | ", " |", row11));
        long i_852710___aux = clojure.lang.Numbers.unchecked_inc((long)i_852710);
        i_852710 = i_852710___aux;
        continue;
       }
      } else {
       {
        Object temp__4117__auto__12 = ((IFn)const__0.getRawRoot()).invoke(seq_85247);
        Object __r6225 = temp__4117__auto__12;
        if (__r6225 != null && !(__r6225 == Boolean.FALSE)) {
         {
          Object seq_852413 = temp__4117__auto__12;
          Object __r6227 = ((IFn)const__7.getRawRoot()).invoke(seq_852413);
          if (__r6227 != null && !(__r6227 == Boolean.FALSE)) {
           {
            Object c__4343__auto__14 = ((IFn)const__8.getRawRoot()).invoke(seq_852413);
            java.lang.Object seq_85247___aux = ((IFn)const__9.getRawRoot()).invoke(seq_852413);
            java.lang.Object chunk_85258___aux = c__4343__auto__14;
            long count_85269___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__14)));
            long i_852710___aux = clojure.lang.RT.intCast((long)0L);
            seq_85247 = seq_85247___aux;
            chunk_85258 = chunk_85258___aux;
            count_85269 = count_85269___aux;
            i_852710 = i_852710___aux;
            continue;
           }
          } else {
           {
            Object row15 = ((IFn)const__12.getRawRoot()).invoke(seq_852413);
            ((IFn)const__2.getRawRoot()).invoke(((IFn)fmt_row6).invoke("| ", " | ", " |", row15));
            java.lang.Object seq_85247___aux = ((IFn)const__13.getRawRoot()).invoke(seq_852413);
            java.lang.Object chunk_85258___aux = null;
            long count_85269___aux = 0L;
            long i_852710___aux = 0L;
            seq_85247 = seq_85247___aux;
            chunk_85258 = chunk_85258___aux;
            count_85269 = count_85269___aux;
            i_852710 = i_852710___aux;
            continue;
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
  } else {
   return null;
  }
 }
 public java.lang.Object invoke(java.lang.Object rows1) {
  return ((IFn)const__14.getRawRoot()).invoke(((IFn)const__15.getRawRoot()).invoke(((IFn)const__12.getRawRoot()).invoke(rows1)), rows1);
 }
}
