package clojure;

import clojure.lang.*;

public final class pprint_unzip_map_iter__7320__7324_fn__7325 extends clojure.lang.AFunction {
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
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object s__73211;
 Object iter__73200;
 public pprint_unzip_map_iter__7320__7324_fn__7325(final Object s__73211, final Object iter__73200) {
  super();
  this.s__73211 = s__73211;
  this.iter__73200 = iter__73200;
 }
 public java.lang.Object invoke() {
  {
   Object s__73211 = this.s__73211;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__73211);
     Object __r4801 = temp__4117__auto__2;
     if (__r4801 != null && !(__r4801 == Boolean.FALSE)) {
      {
       Object s__73213 = temp__4117__auto__2;
       Object __r4803 = ((IFn)const__1.getRawRoot()).invoke(s__73213);
       if (__r4803 != null && !(__r4803 == Boolean.FALSE)) {
        {
         Object c__4616__auto__4 = ((IFn)const__2.getRawRoot()).invoke(s__73213);
         int size__4617__auto__5 = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4616__auto__4)));
         Object b__73236 = ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(size__4617__auto__5));
         Object __r4805 = ((IFn)new clojure.pprint_unzip_map_iter__7320__7324_fn__7325_fn__7326(size__4617__auto__5, b__73236, c__4616__auto__4)).invoke();
         if (__r4805 != null && !(__r4805 == Boolean.FALSE)) {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__73236), ((IFn)this.iter__73200).invoke(((IFn)const__8.getRawRoot()).invoke(s__73213)));
         } else {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__73236), null);
         }
        }
       } else {
        {
         Object vec__73307 = ((IFn)const__9.getRawRoot()).invoke(s__73213);
         Object k8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73307), (int)RT.intCast(0L), ((java.lang.Object)null)));
         Object vec__73319 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73307), (int)RT.intCast(1L), ((java.lang.Object)null)));
         Object v110 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73319), (int)RT.intCast(0L), ((java.lang.Object)null)));
         Object v211 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__73319), (int)RT.intCast(1L), ((java.lang.Object)null)));
         return ((IFn)const__13.getRawRoot()).invoke(RT.vector(k8, v110), ((IFn)this.iter__73200).invoke(((IFn)const__14.getRawRoot()).invoke(s__73213)));
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
