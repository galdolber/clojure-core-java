package clojure;

import clojure.lang.*;

public final class core_load extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
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
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (java.lang.Object)0L;
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "root-directory");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "ns-name");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__7 = (java.lang.Object)Character.valueOf((char)47);
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "*loading-verbosely*");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "printf");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "flush");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "check-cyclic-dependency");
  const__12 = (clojure.lang.Var)RT.var("clojure.core", "=");
  const__13 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__14 = (clojure.lang.Var)RT.var("clojure.core", "*pending-paths*");
  const__15 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__16 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__17 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_load() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object paths1) {
  {
   Object seq_50332 = ((IFn)const__0.getRawRoot()).invoke(paths1);
   Object chunk_50343 = null;
   long count_50354 = 0L;
   long i_50365 = 0L;
   while(true) {
    if (clojure.lang.Numbers.lt((long)i_50365, (long)count_50354)) {
     {
      Object path6 = ((java.lang.Object)((clojure.lang.Indexed)chunk_50343).nth((int)RT.intCast(i_50365)));
      {
       Object __r3221;
       if (((java.lang.String)path6).startsWith((java.lang.String)((java.lang.String)"/"))) {
        __r3221 = path6;
       } else {
        __r3221 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6.get())), const__7, path6);
       }
       Object path7 = __r3221;
       Object __r3223 = const__8.get();
       if (__r3223 != null && !(__r3223 == Boolean.FALSE)) {
        ((IFn)const__9.getRawRoot()).invoke("(clojure.core/load \"%s\")\n", path7);
        ((IFn)const__10.getRawRoot()).invoke();
       } else {
       }
       ((IFn)const__11.getRawRoot()).invoke(path7);
       if (clojure.lang.Util.equiv(((java.lang.Object)path7), ((java.lang.Object)((IFn)const__13.getRawRoot()).invoke(const__14.get())))) {
       } else {
        {
         ((IFn)const__15.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__14, ((IFn)const__17.getRawRoot()).invoke(const__14.get(), path7)));
         ((IFn)new clojure.core_load_fn__5037(path7)).invoke();
        }
       }
      }
      long i_50365___aux = clojure.lang.Numbers.unchecked_inc((long)i_50365);
      i_50365 = i_50365___aux;
      continue;
     }
    } else {
     {
      Object temp__4117__auto__8 = ((IFn)const__0.getRawRoot()).invoke(seq_50332);
      Object __r3226 = temp__4117__auto__8;
      if (__r3226 != null && !(__r3226 == Boolean.FALSE)) {
       {
        Object seq_50339 = temp__4117__auto__8;
        Object __r3228 = ((IFn)const__19.getRawRoot()).invoke(seq_50339);
        if (__r3228 != null && !(__r3228 == Boolean.FALSE)) {
         {
          Object c__4343__auto__10 = ((IFn)const__20.getRawRoot()).invoke(seq_50339);
          java.lang.Object seq_50332___aux = ((IFn)const__21.getRawRoot()).invoke(seq_50339);
          java.lang.Object chunk_50343___aux = c__4343__auto__10;
          long count_50354___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__10)));
          long i_50365___aux = clojure.lang.RT.intCast((long)0L);
          seq_50332 = seq_50332___aux;
          chunk_50343 = chunk_50343___aux;
          count_50354 = count_50354___aux;
          i_50365 = i_50365___aux;
          continue;
         }
        } else {
         {
          Object path11 = ((IFn)const__13.getRawRoot()).invoke(seq_50339);
          {
           Object __r3229;
           if (((java.lang.String)path11).startsWith((java.lang.String)((java.lang.String)"/"))) {
            __r3229 = path11;
           } else {
            __r3229 = ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(((IFn)const__5.getRawRoot()).invoke(const__6.get())), const__7, path11);
           }
           Object path12 = __r3229;
           Object __r3231 = const__8.get();
           if (__r3231 != null && !(__r3231 == Boolean.FALSE)) {
            ((IFn)const__9.getRawRoot()).invoke("(clojure.core/load \"%s\")\n", path12);
            ((IFn)const__10.getRawRoot()).invoke();
           } else {
           }
           ((IFn)const__11.getRawRoot()).invoke(path12);
           if (clojure.lang.Util.equiv(((java.lang.Object)path12), ((java.lang.Object)((IFn)const__13.getRawRoot()).invoke(const__14.get())))) {
           } else {
            {
             ((IFn)const__15.getRawRoot()).invoke(((IFn)const__16.getRawRoot()).invoke(const__14, ((IFn)const__17.getRawRoot()).invoke(const__14.get(), path12)));
             ((IFn)new clojure.core_load_fn__5039(path12)).invoke();
            }
           }
          }
          java.lang.Object seq_50332___aux = ((IFn)const__24.getRawRoot()).invoke(seq_50339);
          java.lang.Object chunk_50343___aux = null;
          long count_50354___aux = 0L;
          long i_50365___aux = 0L;
          seq_50332 = seq_50332___aux;
          chunk_50343 = chunk_50343___aux;
          count_50354 = count_50354___aux;
          i_50365 = i_50365___aux;
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
 public int getRequiredArity() {
  return 0;
 }
}
