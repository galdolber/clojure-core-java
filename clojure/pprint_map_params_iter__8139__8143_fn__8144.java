package clojure;

import clojure.lang.*;

public final class pprint_map_params_iter__8139__8143_fn__8144 extends clojure.lang.AFunction {
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
 Object s__81401;
 Object offset4;
 Object iter__81390;
 public pprint_map_params_iter__8139__8143_fn__8144(final Object s__81401, final Object offset4, final Object iter__81390) {
  super();
  this.s__81401 = s__81401;
  this.offset4 = offset4;
  this.iter__81390 = iter__81390;
 }
 public java.lang.Object invoke() {
  {
   Object s__81401 = this.s__81401;
   while(true) {
    {
     Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(s__81401);
     Object __r5804 = temp__4117__auto__2;
     if (__r5804 != null && !(__r5804 == Boolean.FALSE)) {
      {
       Object s__81403 = temp__4117__auto__2;
       Object __r5806 = ((IFn)const__1.getRawRoot()).invoke(s__81403);
       if (__r5806 != null && !(__r5806 == Boolean.FALSE)) {
        {
         Object c__4616__auto__4 = ((IFn)const__2.getRawRoot()).invoke(s__81403);
         int size__4617__auto__5 = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4616__auto__4)));
         Object b__81426 = ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(size__4617__auto__5));
         Object __r5808 = ((IFn)new clojure.pprint_map_params_iter__8139__8143_fn__8144_fn__8145(size__4617__auto__5, this.offset4, c__4616__auto__4, b__81426)).invoke();
         if (__r5808 != null && !(__r5808 == Boolean.FALSE)) {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__81426), ((IFn)this.iter__81390).invoke(((IFn)const__8.getRawRoot()).invoke(s__81403)));
         } else {
          return ((IFn)const__6.getRawRoot()).invoke(((IFn)const__7.getRawRoot()).invoke(b__81426), null);
         }
        }
       } else {
        {
         Object vec__81497 = ((IFn)const__9.getRawRoot()).invoke(s__81403);
         Object name8 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81497), (int)RT.intCast(0L), ((java.lang.Object)null)));
         Object vec__81509 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81497), (int)RT.intCast(1L), ((java.lang.Object)null)));
         Object default10 = ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)vec__81509), (int)RT.intCast(0L), ((java.lang.Object)null)));
         return ((IFn)const__13.getRawRoot()).invoke(RT.vector(name8, RT.vector(default10, this.offset4)), ((IFn)this.iter__81390).invoke(((IFn)const__14.getRawRoot()).invoke(s__81403)));
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
