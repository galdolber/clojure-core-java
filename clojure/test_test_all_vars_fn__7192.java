package clojure;

import clojure.lang.*;

public final class test_test_all_vars_fn__7192 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final java.lang.Object const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Keyword const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "vals");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "ns-interns");
  const__3 = (java.lang.Object)0L;
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__5 = (clojure.lang.Keyword)Keyword.intern(null, "test");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 Object each_fixture_fn3;
 Object ns1;
 public test_test_all_vars_fn__7192(final Object each_fixture_fn3, final Object ns1) {
  super();
  this.each_fixture_fn3 = each_fixture_fn3;
  this.ns1 = ns1;
 }
 public java.lang.Object invoke() {
  {
   Object seq_71931 = ((IFn)const__0.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(this.ns1)));
   Object chunk_71942 = null;
   long count_71953 = 0L;
   long i_71964 = 0L;
   while(true) {
    if (clojure.lang.Numbers.lt((long)i_71964, (long)count_71953)) {
     {
      Object v5 = ((java.lang.Object)((clojure.lang.Indexed)chunk_71942).nth((int)RT.intCast(i_71964)));
      Object __r4734 = RT.get(((IFn)const__6.getRawRoot()).invoke(v5), Keyword.intern(null, "test"));
      if (__r4734 != null && !(__r4734 == Boolean.FALSE)) {
       ((IFn)this.each_fixture_fn3).invoke(new clojure.test_test_all_vars_fn__7192_fn__7197(v5));
      } else {
      }
      long i_71964___aux = clojure.lang.Numbers.unchecked_inc((long)i_71964);
      i_71964 = i_71964___aux;
      continue;
     }
    } else {
     {
      Object temp__4117__auto__6 = ((IFn)const__0.getRawRoot()).invoke(seq_71931);
      Object __r4736 = temp__4117__auto__6;
      if (__r4736 != null && !(__r4736 == Boolean.FALSE)) {
       {
        Object seq_71937 = temp__4117__auto__6;
        Object __r4738 = ((IFn)const__8.getRawRoot()).invoke(seq_71937);
        if (__r4738 != null && !(__r4738 == Boolean.FALSE)) {
         {
          Object c__4343__auto__8 = ((IFn)const__9.getRawRoot()).invoke(seq_71937);
          java.lang.Object seq_71931___aux = ((IFn)const__10.getRawRoot()).invoke(seq_71937);
          java.lang.Object chunk_71942___aux = c__4343__auto__8;
          long count_71953___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__8)));
          long i_71964___aux = clojure.lang.RT.intCast((long)0L);
          seq_71931 = seq_71931___aux;
          chunk_71942 = chunk_71942___aux;
          count_71953 = count_71953___aux;
          i_71964 = i_71964___aux;
          continue;
         }
        } else {
         {
          Object v9 = ((IFn)const__13.getRawRoot()).invoke(seq_71937);
          Object __r4740 = RT.get(((IFn)const__6.getRawRoot()).invoke(v9), Keyword.intern(null, "test"));
          if (__r4740 != null && !(__r4740 == Boolean.FALSE)) {
           ((IFn)this.each_fixture_fn3).invoke(new clojure.test_test_all_vars_fn__7192_fn__7199(v9));
          } else {
          }
          java.lang.Object seq_71931___aux = ((IFn)const__14.getRawRoot()).invoke(seq_71937);
          java.lang.Object chunk_71942___aux = null;
          long count_71953___aux = 0L;
          long i_71964___aux = 0L;
          seq_71931 = seq_71931___aux;
          chunk_71942 = chunk_71942___aux;
          count_71953 = count_71953___aux;
          i_71964 = i_71964___aux;
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
}
