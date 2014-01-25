package clojure;

import clojure.lang.*;

public final class core_map_indexed_mapi__6395_fn__6396 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 public static final clojure.lang.Var const__11;
 public static final clojure.lang.Var const__12;
 public static final clojure.lang.Var const__13;
 public static final clojure.lang.Var const__14;
 public static final clojure.lang.Var const__15;
 public static final clojure.lang.Var const__16;
 public static final clojure.lang.Var const__17;
 public static final clojure.lang.Var const__18;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "chunk-buffer");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "long");
  const__7 = (java.lang.Object)0L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "chunk-append");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "+");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "chunk-cons");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "chunk");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "inc");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "rest");
 }
 Object coll2;
 Object mapi0;
 Object idx1;
 Object f1;
 public core_map_indexed_mapi__6395_fn__6396(final Object coll2, final Object mapi0, final Object idx1, final Object f1) {
  super();
  this.coll2 = coll2;
  this.mapi0 = mapi0;
  this.idx1 = idx1;
  this.f1 = f1;
 }
 public java.lang.Object invoke() {
  {
   Object temp__4117__auto__1 = ((IFn)const__0.getRawRoot()).invoke(this.coll2);
   Object __r4118 = temp__4117__auto__1;
   if (__r4118 != null && !(__r4118 == Boolean.FALSE)) {
    {
     Object s2 = temp__4117__auto__1;
     Object __r4120 = ((IFn)const__1.getRawRoot()).invoke(s2);
     if (__r4120 != null && !(__r4120 == Boolean.FALSE)) {
      {
       Object c3 = ((IFn)const__2.getRawRoot()).invoke(s2);
       int size4 = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c3)));
       Object b5 = ((IFn)const__5.getRawRoot()).invoke(Integer.valueOf(size4));
       {
        long n__4366__auto__6 = clojure.lang.RT.longCast((int)size4);
        {
         long i7 = 0L;
         while(true) {
          if (clojure.lang.Numbers.lt((long)i7, (long)n__4366__auto__6)) {
           ((IFn)const__9.getRawRoot()).invoke(b5, ((IFn)this.f1).invoke(((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)this.idx1), (long)i7)), ((java.lang.Object)((clojure.lang.Indexed)c3).nth((int)RT.intCast(i7)))));
           long i7___aux = clojure.lang.Numbers.unchecked_inc((long)i7);
           i7 = i7___aux;
           continue;
          } else {
          }
          break;
         }
        }
       }
       return ((IFn)const__12.getRawRoot()).invoke(((IFn)const__13.getRawRoot()).invoke(b5), ((IFn)this.mapi0).invoke(((java.lang.Number)clojure.lang.Numbers.add(((java.lang.Object)this.idx1), (long)size4)), ((IFn)const__14.getRawRoot()).invoke(s2)));
      }
     } else {
      return ((IFn)const__15.getRawRoot()).invoke(((IFn)this.f1).invoke(this.idx1, ((IFn)const__16.getRawRoot()).invoke(s2)), ((IFn)this.mapi0).invoke(((java.lang.Number)clojure.lang.Numbers.inc(((java.lang.Object)this.idx1))), ((IFn)const__18.getRawRoot()).invoke(s2)));
     }
    }
   } else {
    return null;
   }
  }
 }
}
