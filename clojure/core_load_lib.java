package clojure;

import clojure.lang.*;

public final class core_load_lib extends clojure.lang.RestFn {
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
 public static final clojure.lang.Keyword const__12;
 public static final clojure.lang.Keyword const__13;
 public static final clojure.lang.Keyword const__14;
 public static final clojure.lang.Keyword const__15;
 public static final clojure.lang.Keyword const__16;
 public static final clojure.lang.Keyword const__17;
 public static final clojure.lang.Var const__18;
 public static final clojure.lang.Var const__19;
 public static final clojure.lang.Var const__20;
 public static final clojure.lang.Var const__21;
 public static final clojure.lang.Var const__22;
 public static final clojure.lang.Var const__23;
 public static final clojure.lang.Var const__24;
 public static final clojure.lang.IPersistentStack const__25;
 public static final clojure.lang.Var const__26;
 public static final clojure.lang.Var const__27;
 public static final clojure.lang.Var const__28;
 public static final clojure.lang.Var const__29;
 public static final clojure.lang.Var const__30;
 public static final clojure.lang.Var const__31;
 public static final clojure.lang.Var const__32;
 public static final clojure.lang.Keyword const__33;
 public static final java.lang.Object const__34;
 public static final clojure.lang.Var const__35;
 public static final clojure.lang.Var const__36;
 public static final clojure.lang.Var const__37;
 public static final clojure.lang.Var const__38;
 public static final clojure.lang.Var const__39;
 public static final clojure.lang.Var const__40;
 public static final clojure.lang.Var const__41;
 public static final clojure.lang.Var const__42;
 public static final clojure.lang.Var const__43;
 public static final clojure.lang.Var const__44;
 public static final clojure.lang.Var const__45;
 public static final clojure.lang.Var const__46;
 public static final clojure.lang.Var const__47;
 public static final clojure.lang.Var const__48;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "throw-if");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "pos?");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "int");
  const__4 = (java.lang.Object)Character.valueOf((char)46);
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "symbol");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "hash-map");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "seq?");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__11 = (clojure.lang.Var)RT.var("clojure.core", "get");
  const__12 = (clojure.lang.Keyword)Keyword.intern(null, "verbose");
  const__13 = (clojure.lang.Keyword)Keyword.intern(null, "use");
  const__14 = (clojure.lang.Keyword)Keyword.intern(null, "require");
  const__15 = (clojure.lang.Keyword)Keyword.intern(null, "reload-all");
  const__16 = (clojure.lang.Keyword)Keyword.intern(null, "reload");
  const__17 = (clojure.lang.Keyword)Keyword.intern(null, "as");
  const__18 = (clojure.lang.Var)RT.var("clojure.core", "contains?");
  const__19 = (clojure.lang.Var)RT.var("clojure.core", "deref");
  const__20 = (clojure.lang.Var)RT.var("clojure.core", "*loaded-libs*");
  const__21 = (clojure.lang.Var)RT.var("clojure.core", "load-all");
  const__22 = (clojure.lang.Var)RT.var("clojure.core", "not");
  const__23 = (clojure.lang.Var)RT.var("clojure.core", "load-one");
  const__24 = (clojure.lang.Var)RT.var("clojure.core", "select-keys");
  const__25 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Keyword.intern(null, "exclude"), Keyword.intern(null, "only"), Keyword.intern(null, "rename"), Keyword.intern(null, "refer")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 5435, Keyword.intern(null, "column"), 40));
  const__26 = (clojure.lang.Var)RT.var("clojure.core", "find-ns");
  const__27 = (clojure.lang.Var)RT.var("clojure.core", "push-thread-bindings");
  const__28 = (clojure.lang.Var)RT.var("clojure.core", "*loading-verbosely*");
  const__29 = (clojure.lang.Var)RT.var("clojure.core", "printf");
  const__30 = (clojure.lang.Var)RT.var("clojure.core", "ns-name");
  const__31 = (clojure.lang.Var)RT.var("clojure.core", "*ns*");
  const__32 = (clojure.lang.Var)RT.var("clojure.core", "alias");
  const__33 = (clojure.lang.Keyword)Keyword.intern(null, "refer");
  const__34 = (java.lang.Object)0L;
  const__35 = (clojure.lang.Var)RT.var("clojure.core", "<");
  const__36 = (clojure.lang.Var)RT.var("clojure.core", "key");
  const__37 = (clojure.lang.Var)RT.var("clojure.core", "print-str");
  const__38 = (clojure.lang.Var)RT.var("clojure.core", "val");
  const__39 = (clojure.lang.Var)RT.var("clojure.core", "unchecked-inc");
  const__40 = (clojure.lang.Var)RT.var("clojure.core", "chunked-seq?");
  const__41 = (clojure.lang.Var)RT.var("clojure.core", "chunk-first");
  const__42 = (clojure.lang.Var)RT.var("clojure.core", "chunk-rest");
  const__43 = (clojure.lang.Var)RT.var("clojure.core", "count");
  const__44 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__45 = (clojure.lang.Var)RT.var("clojure.core", "next");
  const__46 = (clojure.lang.Var)RT.var("clojure.core", "refer");
  const__47 = (clojure.lang.Var)RT.var("clojure.core", "mapcat");
  const__48 = (clojure.lang.Var)RT.var("clojure.core", "pop-thread-bindings");
 }
 public core_load_lib() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object prefix1, java.lang.Object lib2, java.lang.Object options3) {
  Object __r3149 = null;
  {
   Object and__3966__auto__4 = prefix1;
   Object __r3150;
   Object __r3151 = and__3966__auto__4;
   if (__r3151 != null && !(__r3151 == Boolean.FALSE)) {
    __r3150 = (clojure.lang.Numbers.isPos((long)((java.lang.String)((IFn)const__2.getRawRoot()).invoke(lib2)).indexOf((int)clojure.lang.RT.intCast(((java.lang.Object)const__4)))) ? Boolean.TRUE : Boolean.FALSE);
   } else {
    __r3150 = and__3966__auto__4;
   }
   __r3149 = __r3150;
  }
  ((IFn)const__0.getRawRoot()).invoke(__r3149, "lib names inside prefix lists must not contain periods");
  {
   Object __r3152;
   Object __r3153 = prefix1;
   if (__r3153 != null && !(__r3153 == Boolean.FALSE)) {
    __r3152 = ((IFn)const__5.getRawRoot()).invoke(((IFn)const__6.getRawRoot()).invoke(prefix1, const__4, lib2));
   } else {
    __r3152 = lib2;
   }
   Object lib5 = __r3152;
   Object opts6 = ((IFn)const__7.getRawRoot()).invoke(const__8.getRawRoot(), options3);
   Object map__49877 = opts6;
   Object __r3154;
   Object __r3155 = ((IFn)const__9.getRawRoot()).invoke(map__49877);
   if (__r3155 != null && !(__r3155 == Boolean.FALSE)) {
    __r3154 = ((clojure.lang.PersistentHashMap)clojure.lang.PersistentHashMap.create((clojure.lang.ISeq)((clojure.lang.ISeq)((IFn)const__10.getRawRoot()).invoke(map__49877))));
   } else {
    __r3154 = map__49877;
   }
   Object map__49878 = __r3154;
   Object verbose9 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__49878), ((java.lang.Object)const__12)));
   Object use10 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__49878), ((java.lang.Object)const__13)));
   Object require11 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__49878), ((java.lang.Object)const__14)));
   Object reload_all12 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__49878), ((java.lang.Object)const__15)));
   Object reload13 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__49878), ((java.lang.Object)const__16)));
   Object as14 = ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map__49878), ((java.lang.Object)const__17)));
   Object loaded15 = ((IFn)const__18.getRawRoot()).invoke(((IFn)const__19.getRawRoot()).invoke(const__20.get()), lib5);
   Object __r3156;
   Object __r3157 = reload_all12;
   if (__r3157 != null && !(__r3157 == Boolean.FALSE)) {
    __r3156 = const__21.getRawRoot();
   } else {
    Object __r3158;
    Object __r3159 = null;
    {
     Object or__3968__auto__16 = reload13;
     Object __r3160;
     Object __r3161 = or__3968__auto__16;
     if (__r3161 != null && !(__r3161 == Boolean.FALSE)) {
      __r3160 = or__3968__auto__16;
     } else {
      Object __r3162 = null;
      {
       Object or__3968__auto__17 = ((IFn)const__22.getRawRoot()).invoke(require11);
       Object __r3163;
       Object __r3164 = or__3968__auto__17;
       if (__r3164 != null && !(__r3164 == Boolean.FALSE)) {
        __r3163 = or__3968__auto__17;
       } else {
        __r3163 = ((IFn)const__22.getRawRoot()).invoke(loaded15);
       }
       __r3162 = __r3163;
      }
      __r3160 = __r3162;
     }
     __r3159 = __r3160;
    }
    Object __r3165 = __r3159;
    if (__r3165 != null && !(__r3165 == Boolean.FALSE)) {
     __r3158 = const__23.getRawRoot();
    } else {
     __r3158 = null;
    }
    __r3156 = __r3158;
   }
   Object load18 = __r3156;
   Object __r3166 = null;
   {
    Object or__3968__auto__19 = as14;
    Object __r3167;
    Object __r3168 = or__3968__auto__19;
    if (__r3168 != null && !(__r3168 == Boolean.FALSE)) {
     __r3167 = or__3968__auto__19;
    } else {
     __r3167 = use10;
    }
    __r3166 = __r3167;
   }
   Object need_ns20 = __r3166;
   Object filter_opts21 = ((IFn)const__24.getRawRoot()).invoke(opts6, const__25);
   Object undefined_on_entry22 = ((IFn)const__22.getRawRoot()).invoke(((IFn)const__26.getRawRoot()).invoke(lib5));
   {
    Object __r3169 = null;
    {
     Object or__3968__auto__23 = const__28.get();
     Object __r3170;
     Object __r3171 = or__3968__auto__23;
     if (__r3171 != null && !(__r3171 == Boolean.FALSE)) {
      __r3170 = or__3968__auto__23;
     } else {
      __r3170 = verbose9;
     }
     __r3169 = __r3170;
    }
    ((IFn)const__27.getRawRoot()).invoke(((IFn)const__8.getRawRoot()).invoke(const__28, __r3169));
    try {
     Object __r3173 = load18;
     if (__r3173 != null && !(__r3173 == Boolean.FALSE)) {
      ((IFn)new clojure.core_load_lib_fn__4988(load18, lib5, undefined_on_entry22, need_ns20, require11)).invoke();
     } else {
      Object __r3174 = null;
      {
       Object and__3966__auto__26 = need_ns20;
       Object __r3175;
       Object __r3176 = and__3966__auto__26;
       if (__r3176 != null && !(__r3176 == Boolean.FALSE)) {
        __r3175 = ((IFn)const__22.getRawRoot()).invoke(((IFn)const__26.getRawRoot()).invoke(lib5));
       } else {
        __r3175 = and__3966__auto__26;
       }
       __r3174 = __r3175;
      }
      ((IFn)const__0.getRawRoot()).invoke(__r3174, "namespace '%s' not found", lib5);
     }
     Object __r3178 = null;
     {
      Object and__3966__auto__27 = need_ns20;
      Object __r3179;
      Object __r3180 = and__3966__auto__27;
      if (__r3180 != null && !(__r3180 == Boolean.FALSE)) {
       __r3179 = const__28.get();
      } else {
       __r3179 = and__3966__auto__27;
      }
      __r3178 = __r3179;
     }
     Object __r3181 = __r3178;
     if (__r3181 != null && !(__r3181 == Boolean.FALSE)) {
      ((IFn)const__29.getRawRoot()).invoke("(clojure.core/in-ns '%s)\n", ((IFn)const__30.getRawRoot()).invoke(const__31.get()));
     } else {
     }
     Object __r3183 = as14;
     if (__r3183 != null && !(__r3183 == Boolean.FALSE)) {
      Object __r3185 = const__28.get();
      if (__r3185 != null && !(__r3185 == Boolean.FALSE)) {
       ((IFn)const__29.getRawRoot()).invoke("(clojure.core/alias '%s '%s)\n", as14, lib5);
      } else {
      }
      ((IFn)const__32.getRawRoot()).invoke(as14, lib5);
     } else {
     }
     Object __r3187 = null;
     {
      Object or__3968__auto__28 = use10;
      Object __r3188;
      Object __r3189 = or__3968__auto__28;
      if (__r3189 != null && !(__r3189 == Boolean.FALSE)) {
       __r3188 = or__3968__auto__28;
      } else {
       __r3188 = RT.get(filter_opts21, Keyword.intern(null, "refer"));
      }
      __r3187 = __r3188;
     }
     Object __r3190 = __r3187;
     if (__r3190 != null && !(__r3190 == Boolean.FALSE)) {
      Object __r3192 = const__28.get();
      if (__r3192 != null && !(__r3192 == Boolean.FALSE)) {
       ((IFn)const__29.getRawRoot()).invoke("(clojure.core/refer '%s", lib5);
       {
        Object seq_499029 = ((IFn)const__10.getRawRoot()).invoke(filter_opts21);
        Object chunk_499130 = null;
        long count_499231 = 0L;
        long i_499332 = 0L;
        while(true) {
         if (clojure.lang.Numbers.lt((long)i_499332, (long)count_499231)) {
          {
           Object opt33 = ((java.lang.Object)((clojure.lang.Indexed)chunk_499130).nth((int)RT.intCast(i_499332)));
           ((IFn)const__29.getRawRoot()).invoke(" %s '%s", ((IFn)const__36.getRawRoot()).invoke(opt33), ((IFn)const__37.getRawRoot()).invoke(((IFn)const__38.getRawRoot()).invoke(opt33)));
           long i_499332___aux = clojure.lang.Numbers.unchecked_inc((long)i_499332);
           i_499332 = i_499332___aux;
           continue;
          }
         } else {
          {
           Object temp__4117__auto__34 = ((IFn)const__10.getRawRoot()).invoke(seq_499029);
           Object __r3195 = temp__4117__auto__34;
           if (__r3195 != null && !(__r3195 == Boolean.FALSE)) {
            {
             Object seq_499035 = temp__4117__auto__34;
             Object __r3197 = ((IFn)const__40.getRawRoot()).invoke(seq_499035);
             if (__r3197 != null && !(__r3197 == Boolean.FALSE)) {
              {
               Object c__4343__auto__36 = ((IFn)const__41.getRawRoot()).invoke(seq_499035);
               java.lang.Object seq_499029___aux = ((IFn)const__42.getRawRoot()).invoke(seq_499035);
               java.lang.Object chunk_499130___aux = c__4343__auto__36;
               long count_499231___aux = clojure.lang.RT.intCast((int)clojure.lang.RT.count(((java.lang.Object)c__4343__auto__36)));
               long i_499332___aux = clojure.lang.RT.intCast((long)0L);
               seq_499029 = seq_499029___aux;
               chunk_499130 = chunk_499130___aux;
               count_499231 = count_499231___aux;
               i_499332 = i_499332___aux;
               continue;
              }
             } else {
              {
               Object opt37 = ((IFn)const__44.getRawRoot()).invoke(seq_499035);
               ((IFn)const__29.getRawRoot()).invoke(" %s '%s", ((IFn)const__36.getRawRoot()).invoke(opt37), ((IFn)const__37.getRawRoot()).invoke(((IFn)const__38.getRawRoot()).invoke(opt37)));
               java.lang.Object seq_499029___aux = ((IFn)const__45.getRawRoot()).invoke(seq_499035);
               java.lang.Object chunk_499130___aux = null;
               long count_499231___aux = 0L;
               long i_499332___aux = 0L;
               seq_499029 = seq_499029___aux;
               chunk_499130 = chunk_499130___aux;
               count_499231 = count_499231___aux;
               i_499332 = i_499332___aux;
               continue;
              }
             }
            }
           } else {
           }
          }
         }
         break;
        }
       }
       ((IFn)const__29.getRawRoot()).invoke(")\n");
      } else {
      }
      return ((IFn)const__7.getRawRoot()).invoke(const__46.getRawRoot(), lib5, ((IFn)const__47.getRawRoot()).invoke(const__10.getRawRoot(), filter_opts21));
     } else {
      return null;
     }
    } finally {
     ((IFn)const__48.getRawRoot()).invoke();
    }
   }
  }
 }
 public int getRequiredArity() {
  return 2;
 }
}
